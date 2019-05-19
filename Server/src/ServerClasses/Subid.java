package ServerClasses;
import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Subid implements Serializable {

    private int subid,teacherid,studentid;

    public Subid(int subid, int teacherid, int studentid) {
        this.subid = subid;
        this.teacherid = teacherid;
        this.studentid = studentid;
    }

    public Subid(ResultSet rs) throws SQLException {
        try {
            this.subid = rs.getInt(3);
            this.teacherid = rs.getInt(2);
            this.studentid = rs.getInt(3);
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public int getSubid() {
        return subid;
    }

    public void setSubid(int subid) {
        this.subid = subid;
    }

    public int getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(int teacherid) {
        this.teacherid = teacherid;
    }

    public int getStudentid() {
        return studentid;
    }

    public void setStudentid(int studentid) {
        this.studentid = studentid;
    }
}
