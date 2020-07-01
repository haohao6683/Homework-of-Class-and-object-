import com.alibaba.fastjson.JSONObject;
import model.Student;

public class Main {

    public static void main(String[] args) {
        Student demo = new Student(1,"Draymond",22,"male");
        System.out.print(JSONObject.toJSONString(demo));
    }
}
