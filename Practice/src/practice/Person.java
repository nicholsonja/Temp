/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * @author nicholsonja
 */
public class Person {

    private String firstName;

    private String lastName;

    private int age;

    private boolean alive;

    public Person(String firstName, String lastName, int age, boolean alive) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.alive = alive;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
    
    

    /**
     * Get the value of alive
     *
     * @return the value of alive
     */
    public boolean isAlive() {
        return alive;
    }

    /**
     * Set the value of alive
     *
     * @param alive new value of alive
     */
    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    /**
     * Get the value of age
     *
     * @return the value of age
     */
    public int getAge() {
        return age;
    }

    /**
     * Set the value of age
     *
     * @param age new value of age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Get the value of firstName
     *
     * @return the value of firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Set the value of firstName
     *
     * @param firstName new value of firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Get the value of lastName
     *
     * @return the value of lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Set the value of lastName
     *
     * @param lastName new value of lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
