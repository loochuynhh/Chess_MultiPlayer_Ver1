import { Client, Message } from '@stomp/stompjs';

const socket = new Client({
    brokerURL: '/ws', // Địa chỉ endpoint WebSocket đã cấu hình trên máy chủ Spring Boot
    debug: (str) => {
        console.log(str);
    },
    reconnectDelay: 5000,
});

socket.activate();

// Hàm xử lý khi kết nối thành công
socket.onConnect = (frame) => {
    console.log('Kết nối thành công');
    // Thực hiện gửi tin nhắn sau khi kết nối thành công
    socket.publish({
        destination: '/app/your-destination', // Đường dẫn xác định bởi cấu hình trên máy chủ
        body: 'Tin nhắn từ client',
    });
};

// Hàm xử lý khi nhận tin nhắn từ server
socket.onMessage = (message: Message) => {
    console.log('Nhận tin nhắn:', message.body);
};

// Xử lý khi đóng kết nối
socket.onDisconnect = (frame) => {
    console.log('Đã đóng kết nối');
};
