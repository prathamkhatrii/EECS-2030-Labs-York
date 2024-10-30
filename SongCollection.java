package lab8;

import java.lang.reflect.Array;
import java.util.*;

public class SongCollection {

	private String listName;

	ArrayList<Song> alist = new ArrayList<>();

	public SongCollection(String str) {
		this.listName = str;

	}

	public SongCollection(SongCollection sc) {
		this.setListName(sc.getListName());
		this.addSongs(sc.getListofSongs());

	}

	public String getListName() {
		return this.listName;
	}

	public ArrayList<Song> getListofSongs() {
		return this.alist;

	}

	public void setListName(String s) {
		this.listName = s;
	}

	public void addSongs(List<Song> s) {
		for (Song i : s) {
				this.alist.add(i);
		}
	}

	public void removeSong(Song sr) {
		this.alist.remove(sr);

	}

	public boolean contains(Song s) {
		for (int i = 0; i < alist.size(); i++) {
			if (this.alist.get(i) == s) {
				return true;
			}
		}
		return false;

	}

	public boolean inSongCollection(String str) {
		for (int i = 0; i < alist.size(); i++) {
			if (alist.get(i).getSongArtist() == str) {
				return true;
			}
		}
		return false;
	}

	public ArrayList<Song> getSongsforArtist(String str) {
		ArrayList<Song> blist = new ArrayList<>();

		for (int i = 0; i < alist.size(); i++) {
			if (alist.get(i).getSongArtist() == str) {
				blist.add(alist.get(i));
			}
		}
		return blist;
	}

	public String totalListeningTime() {
		int a = 0;

		for (int i = 0; i < alist.size(); i++) {
			a += alist.get(i).getSongLength();
		}
		int y = 0;
		int x = 0;
		int z = 0;

		y += a / 3600;
		a = a - y * 3600;

		z = a % 60;
		a -= z;

		x = a / 60;
		String b = String.format("%02d", z);
		String c = String.format("%02d", x);

		return "Total Listening Time: " + y + ":" + c + ":" + b;
	}

}
