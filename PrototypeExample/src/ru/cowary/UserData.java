package ru.cowary;

public class UserData {
    public String name;
    public String password;
    public int id;

    public UserData(String name, String password, int id){
        this.name = name;
        this.password = password;
        this.id = id;
    }

    public  UserData(UserData data){
        if(data != null){
            this.name = data.name;
            this.password = data.password;
            this.id = data.id;
        }
    }

    @Override
    public  UserData clone(){
        return new UserData(this);
    }

    public  boolean equals(Object object){
        if(!(object instanceof UserData)) return false;
        UserData userData = (UserData) object;
        return userData.id == id;
    }
}
