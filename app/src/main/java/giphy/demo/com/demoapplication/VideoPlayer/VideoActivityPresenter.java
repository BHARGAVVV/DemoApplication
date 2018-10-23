package giphy.demo.com.demoapplication.VideoPlayer;

import giphy.demo.com.demoapplication.baseActivity.BasePresenter;
import giphy.demo.com.demoapplication.data.DataManger;
import giphy.demo.com.demoapplication.data.model.VideoDbEntity;

public class VideoActivityPresenter extends BasePresenter<VideoActivityNavigator> {

    public VideoActivityPresenter(DataManger dataManager) {
        super(dataManager);
    }

    public long insertVote(int votetype,String vId){
        VideoDbEntity entity=new VideoDbEntity();
        entity.setvId(vId);
        entity.setVoteType(votetype);
        getDataManager().insertVideo(entity);
        return votetype==1?getDataManager().getListOfUpVots(vId):getDataManager().getListOfDownVots(vId);
    }

    public void getdata(){
        getDataManager().list();
    }

    public long getUpVots(String vId){
        return getDataManager().getListOfUpVots(vId);
    }

    public long getDownVots(String vId){
        return getDataManager().getListOfDownVots(vId);
    }
}
