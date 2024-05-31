CREATE TABLE IF NOT EXISTS dance (
	id SERIAL PRIMARY KEY,
	type text NOT NULL,
	degree text NOT NULL,
	schedule text NOT NULL,
	fee numeric NOT NULL,
	image text NULL
);