package com.vss.app.volley;

public class MyNewRequest
{
    private String username;

    private String devicetoken;

    private String password;

    public MyNewRequest(String username, String devicetoken, String password) {
        this.username = username;
        this.devicetoken = devicetoken;
        this.password = password;
    }

    public String getUsername ()
    {
        return username;
    }

    public void setUsername (String username)
    {
        this.username = username;
    }

    public String getDevicetoken ()
    {
        return devicetoken;
    }

    public void setDevicetoken (String devicetoken)
    {
        this.devicetoken = devicetoken;
    }

    public String getPassword ()
    {
        return password;
    }

    public void setPassword (String password)
    {
        this.password = password;
    }

}