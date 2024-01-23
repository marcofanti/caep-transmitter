package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * [Spec](https://datatracker.ietf.org/doc/html/draft-ietf-secevent-subject-identifiers#section-3.2.6)  The Opaque Identifier Format describes a subject that is identified with a string with no semantics asserted beyond its usage as an identifier for the subject, such as a UUID or hash used as a surrogate identifier for a record in a database.  Subject Identifiers in this format MUST contain an \&quot;id\&quot; member whose value is a JSON string containing the opaque string identifier for the subject.  The \&quot;id\&quot; member is REQUIRED and MUST NOT be null or empty.  The Opaque Identifier Format is identified by the name \&quot;opaque\&quot;.
 */

@Schema(name = "Opaque", description = "[Spec](https://datatracker.ietf.org/doc/html/draft-ietf-secevent-subject-identifiers#section-3.2.6)  The Opaque Identifier Format describes a subject that is identified with a string with no semantics asserted beyond its usage as an identifier for the subject, such as a UUID or hash used as a surrogate identifier for a record in a database.  Subject Identifiers in this format MUST contain an \"id\" member whose value is a JSON string containing the opaque string identifier for the subject.  The \"id\" member is REQUIRED and MUST NOT be null or empty.  The Opaque Identifier Format is identified by the name \"opaque\".")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-15T16:42:52.857708-05:00[America/New_York]")
public class Opaque implements SimpleSubject {

  private String format = "opaque";

  private String id;

  public Opaque() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Opaque(String format, String id) {
    this.format = format;
    this.id = id;
  }

  public Opaque format(String format) {
    this.format = format;
    return this;
  }

  /**
   * Get format
   * @return format
  */
  @NotNull 
  @Schema(name = "format", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("format")
  public String getFormat() {
    return format;
  }

  public void setFormat(String format) {
    this.format = format;
  }

  public Opaque id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @NotNull 
  @Schema(name = "id", example = "11112222333344445555", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Opaque opaque = (Opaque) o;
    return Objects.equals(this.format, opaque.format) &&
        Objects.equals(this.id, opaque.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(format, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Opaque {\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

