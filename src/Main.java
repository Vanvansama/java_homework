import model.Student;

public class Main {

    public static void main(String[] args) {
        Student student = new Student("stefan",22,1,123456);
        System.out.println("姓名："+student.getName()+
                "年龄："+student.getAge()+
                "性别："+student.getSex()+
                "id："+student.getId());
    }
}
