package com.Streams4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ApplicationFile {
	public static void main(String[] args) throws IOException {
		
		/*Stream<String> words = null;
		try {
			words = Files.lines(Paths.get("File/wordFile.txt"));
			words.sorted()
			.filter(l -> l.length()>6)
			.forEach(x -> System.out.print(x+ ", "));
		} catch (IOException e) {
			e.printStackTrace();
		}
		words.close();*/
		
		List<String> lines = Files.lines(Paths.get("File/wordFile.txt"))
				.filter(x -> x.contains("ha"))
				.collect(Collectors.toList());
		lines.forEach(x -> System.out.print(x+ ", "));
		System.out.println();
		
		Stream<String> rows = Files.lines(Paths.get("File/stockDataCsv.txt"));
		int rowcount = (int) rows
			.map(x -> x.split(","))
			.filter(x -> x.length > 3)
			.count(); 
		System.out.println(rowcount+ "rows are present");
		
		Stream<String> row = Files.lines(Paths.get("File/stockDataCsv.txt"));
		row.map(x -> x.split(","))
			.filter(x -> x.length > 3)
			.filter(x -> Integer.parseInt(x[1].trim()) > 10)
			.forEach(x -> System.out.println(x[0].trim()+ " " +x[1].trim()+ " "));
		rows.close();
	}

}
