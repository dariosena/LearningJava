package di;

public class UserDataRepositoryImpl implements UserDataRepository {

  @Override
  public void save(User user) {
    System.out.println("User saved!");
  }
}
