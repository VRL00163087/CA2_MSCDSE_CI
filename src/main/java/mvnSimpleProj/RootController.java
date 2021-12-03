package mvnSimpleProj;

public class App {

	public App() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
@RequestMapping(value = "/", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<Void> getRoot() {
        return new ResponseEntity<>(HttpStatus.OK);
    }
	}

}
