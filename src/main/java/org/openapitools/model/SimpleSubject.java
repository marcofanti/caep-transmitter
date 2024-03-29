package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.openapitools.model.Account;
import org.openapitools.model.DID;
import org.openapitools.model.Email;
import org.openapitools.model.IssSub;
import org.openapitools.model.JwtID;
import org.openapitools.model.Opaque;
import org.openapitools.model.PhoneNumber;
import org.openapitools.model.SamlAssertionID;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;


@JsonIgnoreProperties(
  value = "format", // ignore manually set format, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the format to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "format", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = Account.class, name = "Account"),
  @JsonSubTypes.Type(value = ComplexSubjectApplication.class, name = "ComplexSubject_application"),
  @JsonSubTypes.Type(value = ComplexSubjectDevice.class, name = "ComplexSubject_device"),
  @JsonSubTypes.Type(value = ComplexSubjectGroup.class, name = "ComplexSubject_group"),
  @JsonSubTypes.Type(value = ComplexSubjectOrgUnit.class, name = "ComplexSubject_org_unit"),
  @JsonSubTypes.Type(value = ComplexSubjectSession.class, name = "ComplexSubject_session"),
  @JsonSubTypes.Type(value = ComplexSubjectTenant.class, name = "ComplexSubject_tenant"),
  @JsonSubTypes.Type(value = ComplexSubjectUser.class, name = "ComplexSubject_user"),
  @JsonSubTypes.Type(value = DID.class, name = "DID"),
  @JsonSubTypes.Type(value = Email.class, name = "Email"),
  @JsonSubTypes.Type(value = IssSub.class, name = "IssSub"),
  @JsonSubTypes.Type(value = JwtID.class, name = "JwtID"),
  @JsonSubTypes.Type(value = Opaque.class, name = "Opaque"),
  @JsonSubTypes.Type(value = PhoneNumber.class, name = "PhoneNumber"),
  @JsonSubTypes.Type(value = SamlAssertionID.class, name = "SamlAssertionID")
})

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-15T16:42:52.857708-05:00[America/New_York]")
public interface SimpleSubject extends Subject {
    public String getFormat();
}
