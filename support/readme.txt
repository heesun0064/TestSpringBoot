
Lombok 설치
===========

lombok을 STS에서 사용하기 위해서는 STS에 lombok plugin을 설치해야 한다.
(1) https://projectlombok.org/download 에서 lombok.jar를 다운로드 받는다.
(2) java -jar lombok.jar를 실행한다.
(3) 실행되면 IDE를 찾다가 실패했다는 오류 메시지가 뜨는데 이 때 Specify Location 버튼을 누르고 STS.exe가 설치된 디렉토리를 선택한다.
(4) Install/Update 버튼을 눌러 STS에 plugin을 설치한다.

이후 @Entity가 선언된 도메인 객체에 @Getter를 지정하고 저장하면 자동으로 getter가 생성된다. @Getter 이외에 다른 annotation도 있다. 아래 예 참조
@Getter
@Setter
@NoArgsConstructor
@Entity
public class Book extends AbstractPersistable<Long> {
	private String name;
	private String isbn13;
	private String isbn10;
}

@Repository(MyBatis의 경우 Mapper)는 도메인 범위 내에서 주로 사용
@Service 계층에서는 도메인을 넘나드는 혹은 트랜잭션으로 묶어야 하는 계층에 사용
