package org.example.DesignPatterns.BehavioralPatterns.StateMachine;

import java.util.HashMap;
import java.util.Map;

public class PlayerAnimationStateMachine {
    private final Map<PlayerAnimationState, PlayerStateInterface> states;

    private PlayerAnimationState currentState;

    public PlayerAnimationStateMachine(Map<PlayerAnimationState, PlayerStateInterface> states, PlayerAnimationState defaultState) {
        this.states = states;
        this.currentState = defaultState;
    }

    public void updateStateMachine() {
        states.get(currentState).onStateMachineUpdate(this);
    }

    public void changeToState(PlayerAnimationState nextState) {
        if (currentState.equals(nextState)) {
            return;
        }

        currentState = nextState;
    }

    public static void example() {
        Map<PlayerAnimationState, PlayerStateInterface> states = new HashMap<>();

        states.put(PlayerAnimationState.IDLE, machine -> {
           if (PlayerInputManager.isAnalogStickTilted()) {
               machine.changeToState(PlayerAnimationState.MOVE);
           }
           else if (PlayerInputManager.isJumpButtonPressed()) {
               machine.changeToState(PlayerAnimationState.JUMP);
           }
        });

        states.put(PlayerAnimationState.MOVE, machine -> {
            if (PlayerInputManager.isJumpButtonPressed()) {
                machine.changeToState(PlayerAnimationState.JUMP);
            }
            else if (!PlayerInputManager.isAnalogStickTilted()) {
                machine.changeToState(PlayerAnimationState.IDLE);
            }
        });

        // ...

        PlayerAnimationStateMachine stateMachine = new PlayerAnimationStateMachine(states, PlayerAnimationState.IDLE);
    }
}
