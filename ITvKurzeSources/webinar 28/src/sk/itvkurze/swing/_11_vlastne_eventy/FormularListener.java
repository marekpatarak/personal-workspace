package sk.itvkurze.swing._11_vlastne_eventy;

import java.util.EventListener;

public interface FormularListener extends EventListener
{
	public void nastalaFormularEvent(FormularEvent event);
}
