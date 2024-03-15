package Domain;

import java.util.Iterator;
import java.util.List;
    /**Группы сортируются по числу студентов или по ид группы.
     */
public class StudentStream implements Iterable<StudentGroup>{
    private List<StudentGroup> stream;
    private Integer streamID;
    private String studStream = ""; //Это поле нужно для красивого вывода в консоль (убираем лишние скобки и запятые, появляющиеся при выводе списков)
    
    public StudentStream(List<StudentGroup> stream, Integer streamID) {
        this.stream = stream;
        this.streamID = streamID;
    }

    public List<StudentGroup> getStream() {
        return stream;
    }

    public void setStream(List<StudentGroup> stream) {
        this.stream = stream;
    }

    public Integer getStreamID() {
        return streamID;
    }

    public void setStreamID(Integer streamID) {
        this.streamID = streamID;
    }

    @Override
    public String toString() {
        for(StudentGroup gr : stream){
            studStream+=gr;
        }
        return "Поток студентов № " + streamID + ", количество групп: " + stream.size() + ", " + "состав групп:\n" + studStream;
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new GroupIterator(stream);
    }


}
