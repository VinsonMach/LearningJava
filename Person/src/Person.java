// Vinson Mach 
// 09/21/2022
// In this program, we do a challenge with classes to get the full name and age of a person

// This class gets the first name, last name, and age of a person
public class Person
{
    private String firstName;                       // initialize first name
    private String lastName;                        // initialize last name
    private int age;                                // initialize age

    // This method gets the person's first name
    public String getFirstName()
    {
        return firstName;                           // return person's first name
    }

    // This method gets the person's last name
    public String getLastName()
    {
        return lastName;                            // return person's last name
    }

    // This method gets the person's age
    public int getAge()
    {
        return age;                                 // return person's age
    }

    // This method sets the person's first name
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;                 // set class first name = parameter first name
    }

    // This method sets the person's last name
    public void setLastName(String lastName)
    {
        this.lastName = lastName;                   // set class last name = parameter last name
    }

    // This method sets the person's age
    public void setAge(int age)
    {
        if (age < 0 || age > 100)                   // age validation
        {
            this.age = 0;                           // set class age = 0 if invalid value
        }
        else
        {
            this.age = age;                         // set class age = parameter age
        }
    }

    // This method calculates if the person is a teen or not
    public boolean isTeen()
    {
        if (age > 12 && age < 20)
        {
            return true;                            // return true if age is > 12 and < 20
        }
        else
        {
            return false;                           // return false if age is < 12 and > 20
        }
    }

    // // This method gets the person's full name
    public String getFullName()
    {
        if (firstName.isEmpty() && lastName.isEmpty())
        {
            return "";                              // return empty string if first and last names are empty
        }
        else if (lastName.isEmpty())
        {
            return firstName;                       // return first name if last name is empty
        }
        else if (firstName.isEmpty())
        {
            return lastName;                        // return last name if first name is empty
        }
        else
        {
            return (firstName + " " + lastName);    // return full name
        }
    }
}