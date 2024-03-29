/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.2.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.Error;
import org.openapitools.model.VerificationParameters;
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
@Tag(name = "StreamManagement", description = "[Spec](https://openid.net/specs/openid-sse-framework-1_0.html#management) Stream Management endpoints provided by an Event Transmitter so that Event Transmitters may configure Event Streams.")
public interface VerificationApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /verification : Request that a verification event be sent over an Event Stream
     *
     * @param verificationParameters Optional request parameters (optional)
     * @return Request for verification event was successfully received. A successful response from a POST to the Verification Endpoint does not indicate that the verification event was transmitted successfully, only that the Event Transmitter has transmitted the event or will do so at some point in the future.  (status code 204)
     *         or Request body cannot be parsed or the request is otherwise invalid (status code 400)
     *         or Authorization failed or is missing (status code 401)
     *         or Event Receiver is sending too many requests (status code 429)
     */
    @Operation(
        operationId = "verificationRequest",
        summary = "Request that a verification event be sent over an Event Stream",
        tags = { "StreamManagement" },
        responses = {
            @ApiResponse(responseCode = "204", description = "Request for verification event was successfully received. A successful response from a POST to the Verification Endpoint does not indicate that the verification event was transmitted successfully, only that the Event Transmitter has transmitted the event or will do so at some point in the future. "),
            @ApiResponse(responseCode = "400", description = "Request body cannot be parsed or the request is otherwise invalid", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            }),
            @ApiResponse(responseCode = "401", description = "Authorization failed or is missing", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            }),
            @ApiResponse(responseCode = "429", description = "Event Receiver is sending too many requests", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            })
        },
        security = {
            @SecurityRequirement(name = "BearerAuth")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/verification",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    
    default ResponseEntity<Void> verificationRequest(
        @Parameter(name = "VerificationParameters", description = "Optional request parameters") @Valid @RequestBody(required = false) VerificationParameters verificationParameters
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
