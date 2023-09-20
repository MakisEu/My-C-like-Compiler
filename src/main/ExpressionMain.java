package main;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;


import antlr.ExprLexer;
import antlr.ExprParser;
import expression.AntlrToProgram;
import expression.MyErrorListener;
import expression.Program;

public class ExpressionMain {

	public static void main(String[] args) {
		if (args.length!=1) {
			System.out.println(args.length);
			System.err.print("Usage: file name\n");
		}
		else {
			String fileName = args[0];
			ExprParser parser = getParser(fileName);
			
			ParseTree antlrAST = parser.prog();
			
			if (MyErrorListener.hasError) {
				
			}
			else {
				AntlrToProgram progVisitor = new AntlrToProgram();
				Program prog=progVisitor.visit(antlrAST);
				String file="";

				for (String s: progVisitor.files) {
					s=s.replace("PLACEHOLDERBREAK","DIVER");
					s=s.replace("PLACEHOLDERCONTINUE","DIVER");
					file=file+s;
				}
				file=file+"DIVER\t\tLDA\t\tERROR\n";
				file=file+"\t\tCMPA\t\t=1=\n";
				file=file+"\t\tJNE\t\t*+11\n";
				file=file+"\t\tOUT\t\tMSG(19)\n";
				file=file+"\t\tHLT\n";
				file=file+"MSG\t\tALF\t\t\"ZERO \"\n";
				file=file+"\t\tALF\t\t\"DIVIS\"\n";
				file=file+"\t\tALF\t\t\"ION O\"\n";
				file=file+"\t\tALF\t\t\"R OVE\"\n";
				file=file+"\t\tALF\t\t\"RFLOW\"\n";
				file=file+"\t\tALF\t\t\" DETE\"\n";
				file=file+"\t\tALF\t\t\"CTED \"\n";
				
				file=file+"\t\tEND\t\tSTART\n";



				
				file=file+"\n\n\t\tHLT\n";
				file=file+"\t\tEND\t\tSTART\n";
				if (progVisitor.semanticErrors.isEmpty()) {
					try (Writer writer = new BufferedWriter(new OutputStreamWriter(
				              new FileOutputStream("produced.mixal"), "utf-8"))) {
						writer.write(file);
					}
					catch (IOException ex){
						
					}
				}
				else {
					for(String err: progVisitor.semanticErrors) {
						System.out.println(err);
					}
				}
			}
		} 
	}
	private static ExprParser getParser(String fileName) {
		ExprParser parser=null;
		
		try {
			CharStream input=CharStreams.fromFileName(fileName);
			ExprLexer lexer = new ExprLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			parser=new ExprParser(tokens);
			
			parser.removeErrorListeners();
			parser.addErrorListener(new MyErrorListener());
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return parser;
	}
}

