import org.hamcrest.MatcherAssert.assertThat
import org.junit.Test

/*
@Test
fun insertUser_insertsUserIntoDatabase() = runBlockingTest {
    // Given a new user
    val user = User(name = "John Doe", age = 30)

    // When the user is inserted into the database
    userDao.insertUser(user)

    // Then the user is retrieved from the database
    val retrievedUser = userDao.getUserById(user.id)

    // And the retrieved user matches the inserted user
    assertThat(retrievedUser).isEqualTo(user)
}

@Test
fun deleteUser_deletesUserFromDatabase() = runBlockingTest {
    // Given a user in the database
    val user = User(name = "John Doe", age = 30)
    userDao.insertUser(user)

    // When the user is deleted from the database
    userDao.deleteUser(user)

    // Then the user is no longer retrieved from the database
    val retrievedUser = userDao.getUserById(user.id)
    assertThat(retrievedUser).isNull()
}

@Test
fun updateUser_updatesUserInDatabase() = runBlockingTest {
    // Given a user in the database
    val user = User(name = "John Doe", age = 30)
    userDao.insertUser(user)

    // When the user's name is updated
    val updatedUser = user.copy(name = "Jane Doe")
    userDao.updateUser(updatedUser)

    // Then the retrieved user has the updated name
    val retrievedUser = userDao.getUserById(user.id)
    assertThat(retrievedUser?.name).isEqualTo("Jane Doe")
}*/