package giphy.demo.com.demoapplication.data.model;

import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;

@Entity
public class VideoDbEntity {

    @Id
    long id;

    String vId;

    //0 for down 1 for up
    int voteType;

    public VideoDbEntity(){

    }

    public VideoDbEntity(long id, String vId, int voteType) {
        this.id = id;
        this.vId = vId;
        this.voteType = voteType;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getvId() {
        return vId;
    }

    public void setvId(String vId) {
        this.vId = vId;
    }

    public int getVoteType() {
        return voteType;
    }

    public void setVoteType(int voteType) {
        this.voteType = voteType;
    }
}
