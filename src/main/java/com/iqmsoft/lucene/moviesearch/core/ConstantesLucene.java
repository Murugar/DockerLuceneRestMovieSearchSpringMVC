package com.iqmsoft.lucene.moviesearch.core;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.util.Version;

public class ConstantesLucene {
	
	public static String id					= "id";
	public static String title 				= "title";
	public static String original_title 	= "originalTitle";
	public static String description 		= "description";
	public static String poster		 		= "poster";
	public static String year 				= "year";
	public static String voteAverage		= "voteAverage";
	public static String runtime			= "runtime";
	public static String genres				= "genres";
	
	public static String cast				= "cast";
	public static String directorsLiteral	= "directorsLiteral";
	public static String directors			= "directors";
	
	public static String score				= "score";
	

	public static String directory			= "lucene/";
	
	public static Version version			= Version.LUCENE_48;
	
	public static String tokenize			= "+|+";

	
	public static Analyzer getAnalyzer() {
		return new MyAnalyzer(ConstantesLucene.version, false);
	}
	
	public static Analyzer getAnalyzerWithStopWords() {
		return new MyAnalyzer(ConstantesLucene.version, true);
	}

	
}
