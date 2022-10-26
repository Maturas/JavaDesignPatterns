package org.example.SOLID.OpenClosedPrinciple;

/*
    Open for Extension, Closed for Modification
 */
// Open for Extension - class can be inherited from
public class ExampleClass {
    // Closed for Modification - encapsulated fields
    private final Integer someInt;
    private final String someString;

    // Open for Extension - constructor can be used in a super call
    public ExampleClass(Integer someInt, String someString) {
        this.someInt = someInt;
        this.someString = someString;
    }

    // Open for Extension - public, overridable method
    public void methodThatCanBeOverridden() {

    }

    // Closed for Modification - final method, that cannot be overridden
    public final void methodThatShouldNotBeOverridden() {

    }
}
