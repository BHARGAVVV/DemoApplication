package giphy.demo.com.demoapplication.data.local;

import java.util.List;

import javax.inject.Inject;

import giphy.demo.com.demoapplication.data.model.VideoDbEntity;
import giphy.demo.com.demoapplication.data.model.VideoDbEntity_;
import io.objectbox.Box;
import io.objectbox.BoxStore;

public class AppDbHelper implements DbHelper {

    private Box<VideoDbEntity> notesBox;

    @Inject
    public AppDbHelper(BoxStore boxStore){
        notesBox = boxStore.boxFor(VideoDbEntity.class);
    }

    @Override
    public void insertVideo(VideoDbEntity entity) {
        notesBox.put(entity);
    }

    @Override
    public long getListOfUpVots(String vId) {
        return notesBox.query().equal(VideoDbEntity_.vId,vId).equal(VideoDbEntity_.voteType,1).build().count();
    }

    @Override
    public long getListOfDownVots(String vId) {
        return notesBox.query().equal(VideoDbEntity_.vId,vId).equal(VideoDbEntity_.voteType,0).build().count();
    }

    @Override
    public List<VideoDbEntity> list() {
        return notesBox.query().build().find();
    }
}
