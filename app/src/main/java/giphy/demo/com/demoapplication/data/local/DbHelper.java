package giphy.demo.com.demoapplication.data.local;

import java.util.List;

import giphy.demo.com.demoapplication.data.model.VideoDbEntity;

public interface DbHelper {

    void insertVideo(VideoDbEntity entity);

    long getListOfUpVots(String vId);

    long getListOfDownVots(String vId);

    List<VideoDbEntity> list();
}
