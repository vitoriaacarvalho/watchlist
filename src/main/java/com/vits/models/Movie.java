package com.vits.models;

import java.time.LocalDateTime;

import com.vits.enums.Owner;

import jakarta.annotation.Nonnull;
import jakarta.annotation.Nullable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="movie")
public class Movie {
	private String name;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private Owner owner;
	private @Nonnull Integer ownerCode;
	private LocalDateTime creationDate;
	private @Nullable String comments;
	private @Nonnull Integer howMuchWeWannaSeeIt;
	private @Nonnull Boolean alreadyWatched;
	
	public Integer getOwnerCode() {
		return ownerCode;
	}
	public void setOwnerCode(Integer ownerCode) {
		this.ownerCode = ownerCode;
	}
	public Boolean getAlreadyWatched() {
		return alreadyWatched;
	}
	public void setAlreadyWatched(Boolean alreadyWatched) {
		this.alreadyWatched = alreadyWatched;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Owner getOwner() {
		return owner;
	}
	public void setOwner(Owner owner) {
		this.owner = owner;
	}
	public LocalDateTime getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(LocalDateTime creationDate) {
		this.creationDate = creationDate;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public Integer getHowMuchWeWannaSeeIt() {
		return howMuchWeWannaSeeIt;
	}
	public void setHowMuchWeWannaSeeIt(Integer howMuchWeWannaSeeIt) {
		this.howMuchWeWannaSeeIt = howMuchWeWannaSeeIt;
	}
	public Integer getId() {
		return id;
	}
}
