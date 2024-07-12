package com.nvz.gl310_1_2_springboot_soap_ws.soapWebServices;

import com.perscholas.xml.book.GetBookRequest;
import com.perscholas.xml.book.GetBookResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;


@Endpoint //register the class with Spring WS as a Web Service Endpoint
public class BookEndpoint {
    private static final String NAMESPACE_URI = "http://www.perscholas.com/xml/book";

    private BookRepository bookRepository;

    @Autowired
    public BookEndpoint(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    //defines the handler method according to the namespace and localPart attributes
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getBookRequest")
    @ResponsePayload // indicates that the method return a value to be mapped to the response payload
    public GetBookResponse getCountry(@RequestPayload GetBookRequest request) { //indicates that the method accepts a parameter to be mapped from the incoming request
        GetBookResponse response = new GetBookResponse();
        response.setBook(bookRepository.findBookById(request.getId()));
        return response;
    }
}
