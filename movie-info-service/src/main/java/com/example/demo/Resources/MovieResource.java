package com.example.demo.Resources;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.Movie;

@RestController
@RequestMapping("/movies")
public class MovieResource {

	@RequestMapping("/{movieId}")
	public Movie getMovie(@PathVariable String movieId)
	{
		return new Movie(movieId, "Superman");
	}
}
