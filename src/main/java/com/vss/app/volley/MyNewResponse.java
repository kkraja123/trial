package com.vss.app.volley;

public class MyNewResponse
{
    private String contact_number;

    private String id;

    private String message;

    private String result;

    private String updated_at;

    private String contact_email;

    private String teacher_name;

    private String useruuid;

    private String created_at;

    private String school_id;

    public MyNewResponse(String contact_number, String id, String message, String result, String updated_at,
                         String contact_email, String teacher_name, String useruuid, String created_at, String school_id) {

        this.contact_number = contact_number;
        this.id = id;
        this.message = message;
        this.result = result;
        this.updated_at = updated_at;
        this.contact_email = contact_email;
        this.teacher_name = teacher_name;
        this.useruuid = useruuid;
        this.created_at = created_at;
        this.school_id = school_id;
    }

    public String getContact_number ()
    {
        return contact_number;
    }

    public void setContact_number (String contact_number)
    {
        this.contact_number = contact_number;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getMessage ()
    {
        return message;
    }

    public void setMessage (String message)
    {
        this.message = message;
    }

    public String getResult ()
    {
        return result;
    }

    public void setResult (String result)
    {
        this.result = result;
    }

    public String getUpdated_at ()
    {
        return updated_at;
    }

    public void setUpdated_at (String updated_at)
    {
        this.updated_at = updated_at;
    }

    public String getContact_email ()
    {
        return contact_email;
    }

    public void setContact_email (String contact_email)
    {
        this.contact_email = contact_email;
    }

    public String getTeacher_name ()
    {
        return teacher_name;
    }

    public void setTeacher_name (String teacher_name)
    {
        this.teacher_name = teacher_name;
    }

    public String getUseruuid ()
    {
        return useruuid;
    }

    public void setUseruuid (String useruuid)
    {
        this.useruuid = useruuid;
    }

    public String getCreated_at ()
    {
        return created_at;
    }

    public void setCreated_at (String created_at)
    {
        this.created_at = created_at;
    }

    public String getSchool_id ()
    {
        return school_id;
    }

    public void setSchool_id (String school_id)
    {
        this.school_id = school_id;
    }

}
			
			