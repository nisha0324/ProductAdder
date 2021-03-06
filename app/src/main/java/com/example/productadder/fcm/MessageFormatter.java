package com.example.productadder.fcm;

public class MessageFormatter {

    private static String sampleMsgFormat = "{" +
            "  \"to\": \"/topics/%s\"," +
            "  \"data\": {" +
            "       \"title\":\"%s\"," +
            "       \"for\":\"%s\"," +
            "       \"body\":\"%s\"" +
            "   }" +
            "}";

    public static String getSampleMessage(String topic, String title, String forUser, String body){
        return String.format(sampleMsgFormat, topic, title, forUser, body);
    }

}
