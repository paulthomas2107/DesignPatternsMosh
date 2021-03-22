package com.codewithmosh.memento;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class EditorState {
    private final String content;
}
