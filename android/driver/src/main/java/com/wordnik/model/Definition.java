package com.wordnik.model;

import com.wordnik.common.WordnikObject;
import com.wordnik.annotations.AllowableValues;
import com.wordnik.annotations.Required;

import com.wordnik.common.WordListType;
import java.util.List;
import java.util.ArrayList;


/**
 * 
 * NOTE: This class is auto generated by the drive code generator program so please do not edit the program manually.  
 * @author ramesh
 *
 */
public class Definition extends WordnikObject {

		 //
		 private List<ExampleUsage> exampleUses  = new ArrayList< ExampleUsage>();  
			 //
		 private String word ;  
			 //
		 private String text ;  
			 //
		 private List<TextPron> textProns  = new ArrayList< TextPron>();  
			 //
		 private float score ;  
			 //
		 private String partOfSpeech ;  
			 //
		 private List<Note> notes  = new ArrayList< Note>();  
			 //
		 private List<Citation> citations  = new ArrayList< Citation>();  
			 //
		 private List<Related> relatedWords  = new ArrayList< Related>();  
			 //
		 private String sourceDictionary ;  
			 //
		 private List<Label> labels  = new ArrayList< Label>();  
			 //
		 private String sequence ;  
			 //
		 private String seqString ;  
			 //
		 private String extendedText ;  
		
	
		 //
		 
		 public List<ExampleUsage> getExampleUses() {
		 	return exampleUses;
		 }  
		 
		 public void setExampleUses(List<ExampleUsage>  exampleUses) {
		 	this.exampleUses = exampleUses;
		 }
			 //
		 
		 public String getWord() {
		 	return word;
		 }  
		 
		 public void setWord(String  word) {
		 	this.word = word;
		 }
			 //
		 
		 public String getText() {
		 	return text;
		 }  
		 
		 public void setText(String  text) {
		 	this.text = text;
		 }
			 //
		 
		 public List<TextPron> getTextProns() {
		 	return textProns;
		 }  
		 
		 public void setTextProns(List<TextPron>  textProns) {
		 	this.textProns = textProns;
		 }
			 //
		 
		 public float getScore() {
		 	return score;
		 }  
		 
		 public void setScore(float  score) {
		 	this.score = score;
		 }
			 //
		 
		 public String getPartOfSpeech() {
		 	return partOfSpeech;
		 }  
		 
		 public void setPartOfSpeech(String  partOfSpeech) {
		 	this.partOfSpeech = partOfSpeech;
		 }
			 //
		 
		 public List<Note> getNotes() {
		 	return notes;
		 }  
		 
		 public void setNotes(List<Note>  notes) {
		 	this.notes = notes;
		 }
			 //
		 
		 public List<Citation> getCitations() {
		 	return citations;
		 }  
		 
		 public void setCitations(List<Citation>  citations) {
		 	this.citations = citations;
		 }
			 //
		 
		 public List<Related> getRelatedWords() {
		 	return relatedWords;
		 }  
		 
		 public void setRelatedWords(List<Related>  relatedWords) {
		 	this.relatedWords = relatedWords;
		 }
			 //
		 
		 public String getSourceDictionary() {
		 	return sourceDictionary;
		 }  
		 
		 public void setSourceDictionary(String  sourceDictionary) {
		 	this.sourceDictionary = sourceDictionary;
		 }
			 //
		 
		 public List<Label> getLabels() {
		 	return labels;
		 }  
		 
		 public void setLabels(List<Label>  labels) {
		 	this.labels = labels;
		 }
			 //
		 
		 public String getSequence() {
		 	return sequence;
		 }  
		 
		 public void setSequence(String  sequence) {
		 	this.sequence = sequence;
		 }
			 //
		 
		 public String getSeqString() {
		 	return seqString;
		 }  
		 
		 public void setSeqString(String  seqString) {
		 	this.seqString = seqString;
		 }
			 //
		 
		 public String getExtendedText() {
		 	return extendedText;
		 }  
		 
		 public void setExtendedText(String  extendedText) {
		 	this.extendedText = extendedText;
		 }
		
}