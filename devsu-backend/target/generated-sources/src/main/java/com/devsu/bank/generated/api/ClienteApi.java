/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.0.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.devsu.bank.generated.api;

import com.devsu.bank.generated.api.models.Client;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;
import springfox.documentation.annotations.ApiIgnore;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-10-29T21:23:40.061491300+01:00[Europe/Berlin]")
@Validated
@Api(value = "cliente", description = "the cliente API")
public interface ClienteApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /cliente : Get a list of clients
     *
     * @return A list of clients (status code 200)
     */
    @ApiOperation(value = "Get a list of clients", nickname = "clienteGet", notes = "", response = Client.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "A list of clients", response = Client.class, responseContainer = "List") })
    @GetMapping(
        value = "/cliente",
        produces = { "application/json" }
    )
    default ResponseEntity<List<Client>> clienteGet() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"password\" : \"password\", \"address\" : \"address\", \"gender\" : \"gender\", \"phone\" : \"phone\", \"passwordRepeated\" : \"passwordRepeated\", \"name\" : \"name\", \"dateOfBirth\" : \"dateOfBirth\", \"id\" : 0, \"state\" : \"state\", \"age\" : \"age\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * DELETE /cliente/{id} : Delete a client by ID
     *
     * @param id  (required)
     * @return Client successfully deleted (status code 204)
     */
    @ApiOperation(value = "Delete a client by ID", nickname = "clienteIdDelete", notes = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Client successfully deleted") })
    @DeleteMapping(
        value = "/cliente/{id}"
    )
    default ResponseEntity<Void> clienteIdDelete(@ApiParam(value = "",required=true) @PathVariable("id") Integer id) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /cliente/{id} : Get a specific client by ID
     *
     * @param id  (required)
     * @return The requested client (status code 200)
     */
    @ApiOperation(value = "Get a specific client by ID", nickname = "clienteIdGet", notes = "", response = Client.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The requested client", response = Client.class) })
    @GetMapping(
        value = "/cliente/{id}",
        produces = { "application/json" }
    )
    default ResponseEntity<Client> clienteIdGet(@ApiParam(value = "",required=true) @PathVariable("id") Integer id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"password\" : \"password\", \"address\" : \"address\", \"gender\" : \"gender\", \"phone\" : \"phone\", \"passwordRepeated\" : \"passwordRepeated\", \"name\" : \"name\", \"dateOfBirth\" : \"dateOfBirth\", \"id\" : 0, \"state\" : \"state\", \"age\" : \"age\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /cliente/{id} : Update a client by ID
     *
     * @param id  (required)
     * @param client  (required)
     * @return The updated client (status code 200)
     */
    @ApiOperation(value = "Update a client by ID", nickname = "clienteIdPut", notes = "", response = Client.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The updated client", response = Client.class) })
    @PutMapping(
        value = "/cliente/{id}",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<Client> clienteIdPut(@ApiParam(value = "",required=true) @PathVariable("id") Integer id,@ApiParam(value = "" ,required=true )  @Valid @RequestBody Client client) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"password\" : \"password\", \"address\" : \"address\", \"gender\" : \"gender\", \"phone\" : \"phone\", \"passwordRepeated\" : \"passwordRepeated\", \"name\" : \"name\", \"dateOfBirth\" : \"dateOfBirth\", \"id\" : 0, \"state\" : \"state\", \"age\" : \"age\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /cliente : Create a new client
     *
     * @param client  (required)
     * @return The created client (status code 201)
     */
    @ApiOperation(value = "Create a new client", nickname = "clientePost", notes = "", response = Client.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "The created client", response = Client.class) })
    @PostMapping(
        value = "/cliente",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<Client> clientePost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody Client client) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"password\" : \"password\", \"address\" : \"address\", \"gender\" : \"gender\", \"phone\" : \"phone\", \"passwordRepeated\" : \"passwordRepeated\", \"name\" : \"name\", \"dateOfBirth\" : \"dateOfBirth\", \"id\" : 0, \"state\" : \"state\", \"age\" : \"age\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
