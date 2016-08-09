package io.hexlet.xo.model.exceptions;

/**
 * Created by MaRV on 8/9/2016.
 */
public class AlreadyOccupiedException extends AbstractXOException{
    final AbstractXOException e2 = new AlreadyOccupiedException();

}
