class CreateAnswers < ActiveRecord::Migration
  def change
    create_table :answers do |t|
      t.integer :card_id
      t.string :solution
      t.timestamps
    end
  end
end
