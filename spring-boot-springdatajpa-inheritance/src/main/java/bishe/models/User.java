package bishe.models;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * An entity User composed by two fields (id, email).
 * The Entity annotation indicates that this class is a JPA entity.
 * Inheritance defines the inheritance strategy to be used for the entity class
 * hierarchy. Single table inheritance is the default and is the simplest and
 * typically the best performing and best solution.
 * The DiscriminatorColumn annotation specifies the column name used for
 * discriminate from subclasses type (Person and Company) in the users table.
 * The Table annotation specifies the name for the table in the db.
 *
 * @author bishe
 */
@Entity
@Inheritance
@DiscriminatorColumn(name = "user_type")
@Table(name = "users")
public abstract class User {

  // ==============
  // PRIVATE FIELDS
  // ==============
  
  // An autogenerated id (unique for each user in the db)
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  
  // The user email
  @NotNull
  private String email;
  
  // ==============
  // PUBLIC METHODS
  // ==============
  
  /**
   * @return the id
   */
  public long getId() {
    return id;
  }

  /**
   * @return the email
   */
  public String getEmail() {
    return email;
  }

  /**
   * @param id the id to set
   */
  public void setId(long id) {
    this.id = id;
  }

  /**
   * @param email the email to set
   */
  public void setEmail(String email) {
    this.email = email;
  }

} // class User
