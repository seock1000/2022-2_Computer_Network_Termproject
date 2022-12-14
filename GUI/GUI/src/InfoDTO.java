import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.*;
import java.io.*;

enum Info {
	JOIN, EXIT, SEND
}

@NoArgsConstructor
@AllArgsConstructor
class InfoDTO implements Serializable {
	private String nickName;
	private String message;
	private Info command;
	private Integer roomNumber;

	private static final long serialVersionUID = 100L;
	
	public String getNickName(){
		return nickName;
	}
	public Info getCommand(){
		return command;
	}
	public String getMessage(){
		return message;
	}

	public Integer getRoomNumber() { return roomNumber; }

	public void setNickName(String nickName){
		this.nickName= nickName;
	}
	public void setCommand(Info command){
		this.command= command;
	}
	public void setMessage(String message){
		this.message= message; 
	}

	public void setRoomNumber(Integer roomNumber) { this.roomNumber = roomNumber; }
}
/*
ChatClient.java ---> ChatClientObject.java
ChatServer.java ---> ChatServerObject.java
CahtHandler.java ---> ChatHandlerObject.java

BufferedReader�� ����ߴٸ� �̹����� ��ü�� �ѱ�
��絥���͸� String�� �ƴ� InfoDTO�� ������ �޴� ��!
ObjectInputStream�� ObjectOutputStream�� ����ؾ� ��!!


*/