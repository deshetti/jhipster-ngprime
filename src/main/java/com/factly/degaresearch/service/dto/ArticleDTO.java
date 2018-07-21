package com.factly.degaresearch.service.dto;

import javax.validation.constraints.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the Article entity.
 */
public class ArticleDTO implements Serializable {

    private Long id;

    @NotNull
    private String title;

    @NotNull
    private String message;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        ArticleDTO articleDTO = (ArticleDTO) o;
        if (articleDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), articleDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "ArticleDTO{" +
            "id=" + getId() +
            ", title='" + getTitle() + "'" +
            ", message='" + getMessage() + "'" +
            "}";
    }
}
