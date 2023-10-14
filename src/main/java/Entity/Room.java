package Entity;

import jakarta.persistence.*;

import java.time.Instant;
import java.time.LocalDateTime;

@Entity
@Table(name = "room")
public class Room {
    @Id
    @Column(name = "idRoom", nullable = false, length = 45)
    private String idRoom;

    @Column(name = "timeStart")
    private Instant timeStart;

    @Column(name = "timeEnd")
    private Instant timeEnd;

    @Column(name = "Mode", length = 45)
    private String mode;

    @OneToOne(mappedBy = "idRoom")
    private Roomuser roomuser;

    public Room(String idRoom, Instant timeStart, Instant timeEnd, String mode, Roomuser roomuser) {
        this.idRoom = idRoom;
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
        this.mode = mode;
        this.roomuser = roomuser;
    }

    public Room(String number, LocalDateTime now, Object o, String mode1) {

    }

    public String getIdRoom() {
        return idRoom;
    }

    public void setIdRoom(String idRoom) {
        this.idRoom = idRoom;
    }

    public Instant getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(Instant timeStart) {
        this.timeStart = timeStart;
    }

    public Instant getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(Instant timeEnd) {
        this.timeEnd = timeEnd;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public Roomuser getRoomuser() {
        return roomuser;
    }

    public void setRoomuser(Roomuser roomuser) {
        this.roomuser = roomuser;
    }

}