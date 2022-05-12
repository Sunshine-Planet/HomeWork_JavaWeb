package c13.bean;

import java.util.HashMap;
import java.util.Map;

public class Register {
    private String name;
    private String age;
    private Map<String, String> errors = null;
    public Register(){
        this.name = "";
        this.age = "";
        this.errors = new HashMap<String, String>();
    }
    public boolean isValidate(){
        boolean flag = true;
        if (!this.name.matches("\\w{6,15}")){
            flag = false;
            this.name = "";
            errors.put("errname", "用户名是 6 ~ 15 位字母或数字");
        }
        if (!this.age.matches("\\d+")){
            flag = false;
            this.age = "";
            errors.put("errage", "年龄只能是数字");
        }
        return flag;
    }
    public String getErrorMsg(String key){
        String value = this.errors.get(key);
        return (value == null)?"":value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
