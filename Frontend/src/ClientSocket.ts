import WebSocket from "ws" 

const port = 9999
const ws = new WebSocket('ws://localhost:${port}')

ws.on('open', ()=>{
    ws.send('hi this is client')
})
ws.on('message', (data) =>{
    console.log('Receive mess: ${data}')
})