
package com.vangh.Vangh.processors;

import java.util.Properties;

/**
 * Created by janet on 10/2/15.
 */
public class RequestPackageInfo {
    private String hostUrl;

    public RequestPackageInfo(Properties props){
        hostUrl = props.getProperty("host");

    }

}
