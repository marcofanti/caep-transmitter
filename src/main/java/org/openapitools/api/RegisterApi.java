/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.2.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.RegisterParameters;
import org.openapitools.model.RegisterResponse;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-15T16:42:52.857708-05:00[America/New_York]")
@Validated
@Tag(name = "OutOfBand", description = "Endpoints that are NOT a part of the [Open ID Spec](https://openid.net/specs/openid-sse-framework-1_0.html), but that exist for convenience within this demo.")
public interface RegisterApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /register : Request the transmitter to setup a stream for a given receiver.
     * This endpoint is not part of the spec, but rather a quick-and-dirty way to allow a receiver to pass along its audience claim in exchange for a bearer token.
     *
     * @param registerParameters  (required)
     * @return On successful creation of a stream, returns a bearer token that will be used for subsequent requests. (status code 200)
     */
    @Operation(
        operationId = "register",
        summary = "Request the transmitter to setup a stream for a given receiver.",
        description = "This endpoint is not part of the spec, but rather a quick-and-dirty way to allow a receiver to pass along its audience claim in exchange for a bearer token.",
        tags = { "OutOfBand" },
        responses = {
            @ApiResponse(responseCode = "200", description = "On successful creation of a stream, returns a bearer token that will be used for subsequent requests.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = RegisterResponse.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/register",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    
    default ResponseEntity<RegisterResponse> register(
        @Parameter(name = "RegisterParameters", description = "", required = true) @Valid @RequestBody RegisterParameters registerParameters
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"token\" : \"49e5e7785e4e4f688aa49e2585970370\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
