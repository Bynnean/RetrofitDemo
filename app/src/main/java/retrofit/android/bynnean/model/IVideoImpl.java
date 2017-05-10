package retrofit.android.bynnean.model;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.HEAD;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 * Comment:
 * <p>
 * Name: IVideoImpl
 * Author: Bynnean
 * Email: bin2.he@changhong.com
 * Date: 2017-04-27 14:09
 */

public interface IVideoImpl {

    @POST("/chiq_webservice/services?appKey=mr3z5f" +"&method=ch.tvmall.chiq.resource.list"+ "&start={@}"+"&format=json")
    Call<String> getClassifyDataBaseFilter(@Body RequestBody body );

    @POST("/chiq_webservice/services?appKey=mr3z5f" +"&method=ch.tvmall.chiq.resource.list"+ "&v=2"+"&format=json")
    Call<VideoResponesIO> getVideoFilter(@Body RequestBody body);
}
