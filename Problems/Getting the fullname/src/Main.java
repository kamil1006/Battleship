class User {
    private String firstName;
    private String lastName;

    public User() {
        this.firstName = "";
        this.lastName = "";
    }

    public void setFirstName(String firstName) {
       if(firstName==null) this.firstName="";
               else
                   this.firstName=firstName; // write your code here
    }

    public void setLastName(String lastName) {
        if(lastName==null) this.lastName="";
        else
            this.lastName=lastName;
    }

    public String getFullName() {
        if(firstName=="" && lastName=="") return "Unknown";
        else
        if(firstName=="" ) return lastName;
        else
        if(lastName=="") return firstName;
        else return firstName + " " + lastName;



    }
}