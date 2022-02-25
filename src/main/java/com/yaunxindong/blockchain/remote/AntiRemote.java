package com.yaunxindong.blockchain.remote;

import cn.com.antcloud.api.AntFinTechApiClient;
import cn.com.antcloud.api.AntFinTechProfile;
import org.omg.CosNaming.IstringHelper;

/**
 * @author yuanxindong
 * @date 2022-02-25 20:54
 **/
public class AntiRemote {

    public static String  uploadKey(String base64){
        AntFinTechProfile profile = AntFinTechProfile.getProfile(
                "https://openapi.antchain.antgroup.com",
                "<your-access-key>",
                "<your-access-secret>"
                );
        AntFinTechApiClient client = new AntFinTechApiClient(profile);
        //构建请求
//        InitSolutionFilenotaryRequest request =
//                // 初始化客户端 new InitSolutionFilenotaryRequest();
//                request.setAppDid("did:mychain:66530b21a9bee783234c442b653e909136629a5a3075be7b4d9ae085782e3d36 ");
//        request.setProductInstanceId("7304XXXXXXXX");
//        request.setRegionName("CN-HANGZHOU-FINANCE");
//
//
//        // 发送请求，并且获取响应结果
//        InitSolutionFilenotaryResponse response = client.execute(request);
        return null;
    }
}
