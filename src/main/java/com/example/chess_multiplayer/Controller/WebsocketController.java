//package com.example.chess_multiplayer.Controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.event.EventListener;
//import org.springframework.messaging.simp.SimpMessagingTemplate;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.socket.messaging.SessionConnectedEvent;
//
//@Controller
//public class WebsocketController {
//    private SimpMessagingTemplate messagingTemplate;
//
//    @Autowired
//    public WebsocketController(SimpMessagingTemplate messagingTemplate) {
//        this.messagingTemplate = messagingTemplate;
//    }
//
//    @EventListener
//    public void handleWebSocketConnectListener(SessionConnectedEvent event) {
//        // Lấy session ID của client kết nối mới
//        String sessionId = event.getMessage().getHeaders().get("simpSessionId").toString();
//        String clientAddress = event.getUser().getName();
//        System.out.println("Client #" + sessionId + " đã kết nối từ địa chỉ: " + clientAddress);
//        // Xử lý kết nối của client ở đây, ví dụ: gửi thông báo kết nối thành công
//        String successMessage = "Kết nối thành công!";
//        messagingTemplate.convertAndSendToUser(sessionId, "/queue/connect", successMessage);
//    }
//}
