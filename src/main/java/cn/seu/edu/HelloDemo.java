package cn.seu.edu;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by rainnus on 15/3/27.
 */
public class HelloDemo extends ActionSupport {
    public String myname;

    public String helloRainnus() {
        if(this.myname.equals("rainnus")){
            System.out.println("helloooo");
            return "success";
        }

        else {
            System.out.println("hahah");
            return "false";
        }

    }

    public void setMyname(String myname) {
        this.myname = myname;
    }
}
