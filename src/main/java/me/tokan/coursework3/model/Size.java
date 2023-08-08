package me.tokan.coursework3.model;

import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.lang.Nullable;

public enum Size {
	SIZE_36(36.0F),
	SIZE_37(37.0F),
	SIZE_37_5(37.5F);

	private final float size;

	Size(float size) {
		this.size = size;
	}

@JsonValue
	public float getSize() {
		return size;
	}

	@Nullable
	public static Size parse(float size){
		for (Size s: values()){
			if (Float.compare(s.size, size) == 0){
				return s;
			}
		}
		return null;
	}
}
