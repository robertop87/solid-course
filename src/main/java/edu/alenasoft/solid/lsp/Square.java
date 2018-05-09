package edu.alenasoft.solid.lsp;

public class Square extends Rectangle {

  @Override
  public void setHeight(int height) {
    super.setHeight(height);
    super.setWidth(height);
  }

  @Override
  public void setWidth(int width) {
    super.setHeight(width);
    super.setWidth(width);
  }
}
