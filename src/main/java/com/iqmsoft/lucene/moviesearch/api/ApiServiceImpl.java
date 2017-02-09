package com.iqmsoft.lucene.moviesearch.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iqmsoft.lucene.moviesearch.api.ext.TmdbApiServiceImpl;
import com.iqmsoft.lucene.moviesearch.model.Movie;

@Service
public class ApiServiceImpl implements ApiService {

	@Autowired
	private TmdbApiServiceImpl tmdbApiService;

	@Override
	public List<Movie> getMovies() {

		return tmdbApiService.getMovies();
	}

}
