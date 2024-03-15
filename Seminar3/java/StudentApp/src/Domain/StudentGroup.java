package Domain;

import java.util.Iterator;
import java.util.List;
    /**Группы сортируются по числу студентов или по ид группы.
     */
public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup>{
    private List<Student> group;
    private Integer idGroup;
    private String studGroup = ""; //Это поле нужно для красивого вывода в консоль


    public StudentGroup(List<Student> group, Integer idGroup) {
        this.group = group;
        this.idGroup = idGroup;
        for(Student st : group){
            studGroup+=String.format("\t%s", st);
        }
    }

    public List<Student> getGroup() {
        return group;
    }

    public void setGroup(List<Student> group) {
        this.group = group;
    }

    public Integer getIdGroup() {
        return idGroup;
    }

    public void setIdGroup(Integer idGroup) {
        this.idGroup = idGroup;
    }

     @Override
    public String toString() {
        return "Группа " + idGroup +
                " численностью " + this.getGroup().size() + " человек:\n"
                + studGroup  + "\n";
    }

    // @Override
    // public Iterator<Student> iterator() {
    //    return new Iterator<Student>() {

    //     private int counter;

    //     @Override
    //     public boolean hasNext() {

    //         if(counter<group.size())
    //         {
    //             return true;
    //         }
    //         else
    //         {
    //             return false;
    //         }            
    //     }

    //     @Override
    //     public Student next() {            
    //         return group.get(counter++);
    //     }
        
    //    };
        
    // }

     @Override
    public Iterator<Student> iterator() {
       return new StudentIterator(group);
        
    }
/*Компаратор по числу студентов и ид группы */
    @Override
    public int compareTo(StudentGroup o) {
        if(this.getGroup().size() == o.getGroup().size()){
            if(idGroup == o.idGroup){
                return 0;
            }
            if(idGroup > o.idGroup){
                return 1;
            }
            else {
                return -1;
            }
        }
        if(this.getGroup().size() > o.getGroup().size()){
            return 1;
        }
        else{
            return -1;  
        } 
    }
    
    
}
